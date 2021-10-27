package geometrycalculator;

/**
 *
 * @author fermelli
 */
public enum GeometryCalculatorBeanFactory {
    LOCAL {
        public IGeometryCalculatorBean makeGeometryCalculator() {
            return new GeometryBean();
        }
    },
    REMOTE_PROXY {
        public IGeometryCalculatorBean makeGeometryCalculator() {
            try {
                return new GeometryBeanProxy();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    };

    public abstract IGeometryCalculatorBean makeGeometryCalculator();
}
