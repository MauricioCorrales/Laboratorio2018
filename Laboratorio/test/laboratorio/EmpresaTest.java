
package laboratorio;

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
        Movil mov = new Movil("Clio", "2001", "AE-654-JK", "2009");
        Movil mov2 = new Movil("Renault", "205", "AS-321-ÑK", "2012");
        emp.addMovil(mov);
        emp.addMovil(mov2);
        emp.eliminarMovil(mov.getPatente());
        assertEquals(null, emp.buscarMovil("AE-654-JK"));
    }
    
    @Test
    public void eliminarAfiliado(){
        Empresa emp = new Empresa();
        Afiliado afiliado = new Afiliado("Marcos", "Gomez", 25, "Hombre", "40.876.123", "Colon 1123", 012);
        emp.addAfiliado(afiliado);
        Afiliado afiliado2 = new Afiliado("Mauricio", "Corrales", 25, "Hombre", "40.876.123", "Colon 1020", 014);
        emp.addAfiliado(afiliado2);
        emp.eliminarAf(afiliado.getNumAfiliado());
        assertEquals(null, emp.buscarAf(012));
    }
}
