
package laboratorio;

import Exception.ComprobarDocumentoException;
import Exception.ComprobarMovilExcepciom;
import Exception.CustomException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmpresaTest {
    
    public EmpresaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void agregarAfiliado(){
        Empresa emp = new Empresa();
        Afiliado afiliado = new Afiliado("Mauricio", "Corrales", 25, "Hombre", "40.876.123", "Colon 1020", 012);
        emp.addAfiliado(afiliado);
        assertEquals(emp.getAfiliado().size(), 1);
    }
    
    @Test
    public void buscarEmpleado(){
        Empresa emp = new Empresa();
        Empleado empleado = new Empleado("Marcelo", "Fregenal", 31, "Hombre", "40.927.123", "Salta 3021", "Clinico", "Doctor");
        Empleado empleado2 = new Empleado("Marco", "Ferreira", 34, "Hombre", "40.927.313", "Salta 3032", "Clinico", "Doctor");
        emp.addEmpleado(empleado);
        emp.addEmpleado(empleado2);
        Empleado empBusc = emp.buscarEmp(empleado.getDni());
        assertEquals(empleado.getDni(), empBusc.getDni());
    }
    
    @Test
    public void eliminarMovil(){
        Empresa emp = new Empresa();
        try{
            Movil mov = new Movil("Clio", "2001", "AE-654-JK", "2009");
            Movil mov2 = new Movil("Renault", "205", "AS-321-ÑK", "2012");
            emp.addMovil(mov);
            emp.addMovil(mov2);
            emp.eliminarMovil(mov.getPatente());
            assertEquals(null, emp.buscarMovil("AE-654-JK"));
        }catch(CustomException e){
            assertEquals(null, emp.buscarMovil("AE-654-JK"));
        }
    }
    
    @Test
    public void eliminarAfiliado(){
        Empresa emp = new Empresa();
        try{
            Afiliado afiliado = new Afiliado("Marcos", "Gomez", 25, "Hombre", "40.876.123", "Colon 1123", 012);
            emp.addAfiliado(afiliado);
            Afiliado afiliado2 = new Afiliado("Mauricio", "Corrales", 25, "Hombre", "40.876.123", "Colon 1020", 014);
            emp.addAfiliado(afiliado2);
            emp.eliminarAf(afiliado.getNumAfiliado());
            assertEquals(null, emp.buscarAf(012));
        }catch(CustomException e){
            assertEquals(null, emp.buscarMovil("AE-654-JK"));
        }
    }
    
    @Test(expected=ComprobarDocumentoException.class)
    public void validarDni(){
//      Verificaremos que no se haya ingresao una persona antes con dicha DNI
//      antes de agregarla a la coleccion.
        Empresa emp = new Empresa();
        Afiliado af1 = new Afiliado("Mauricio", "Corrales", 25, "Hombre", "40.927.123", "Colon 1020", 014);
        Familiar flia = new Familiar("Maria", "Corrales", 23, "Mujer", "40.876.124", "Colon 1020", "Hermana");
        Empleado empleado = new Empleado("Marcos", "Gomez", 25, "Hombre", "40.876.125", "Colon 1123", "Jefe", "Admnistrativo");
        Afiliado af2 = new Afiliado("Marcelo", "Fregenal", 31, "Hombre", "40.927.123", "Salta 3021", 016); //persona con un dni ya ingresado
        emp.validarDni(af1.getDni()); 
        emp.addAfiliado(af1);
        emp.validarDni(empleado.getDni());
        emp.addEmpleado(empleado);
        emp.validarDni(flia.getDni());
        emp.addFamilia(af1.getNumAfiliado(), flia);
        emp.validarDni(af2.getDni()); //lanza la excepcion
        emp.addAfiliado(af2);
    }
    
    @Test(expected=ComprobarMovilExcepciom.class)
    public void comprobarMovil(){
//      Verificaremos que no se haya ingresao un movil antes con dicha patente
//      antes de agregarlo a la coleccion
        Empresa emp = new Empresa();
        Movil mov1 = new Movil("Renault", "2010", "AS-293-JH", "2012");
        Movil mov2 = new Movil("Clio", "202", "LI-972-JG", "2013");
        Movil mov3 = new Movil("Peugot", "206", "AS-293-JH", "2016"); //automovil con una patente ya ingresada
        emp.comprobarMovil(mov1.getPatente());
        emp.addMovil(mov1);
        emp.comprobarMovil(mov2.getPatente());
        emp.addMovil(mov2);
        emp.comprobarMovil(mov3.getPatente()); //lanza la excepcion
        emp.addMovil(mov3);
    }
    
    @Test
    public void calcularPago(){
        Empresa emp = new Empresa();
        Afiliado af = new Afiliado("Mauricio", "Corrales", 25, "Hombre", "40.927.123", "Colon 1020", 014);
        Familiar flia1 = new Familiar("Marcelo", "Corrales", 31, "Hombre", "40.927.124", "Salta 3021", "Hermano");
        Familiar flia2 = new Familiar("Maria", "Corrales", 23, "Mujer", "40.876.124", "Colon 1020", "Hermana");
        Familiar flia3 = new Familiar("Marcos", "Corrales", 55, "Hombre", "40.876.123", "Colon 1123", "Padre");
        emp.addAfiliado(af);
        emp.addFamilia(af.getNumAfiliado(), flia1);
        emp.addFamilia(af.getNumAfiliado(), flia2);
        emp.addFamilia(af.getNumAfiliado(), flia3);
        assertEquals(660, emp.calcularpago(af.getNumAfiliado()), 0.0001);
    }
}
