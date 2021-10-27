package geometrycalculator;

/**
 *
 * @author fermelli
 */
public class GeometryBeanProxy implements IGeometryCalculatorBean {

    private IGeometryCalculatorBean bean;

    public GeometryBeanProxy() throws Exception {
        bean = doJNDILookup("remote://localhost:4447", "user", "password");
    }

    private IGeometryCalculatorBean doJNDILookup(final String urlProvider, final String securityPrincipal, final String securityCredentials)
        throws Exception {
        System.out.println("Do JNDI lookup for bean");
        Thread.sleep(123);//simulate JNDI load for the remote location
        return GeometryCalculatorBeanFactory.LOCAL.makeGeometryCalculator();
    }

    @Override

    public double calculateCircleCircumference(Circle circle) {
        return bean.calculateCircleCircumference(circle);
    }

}
