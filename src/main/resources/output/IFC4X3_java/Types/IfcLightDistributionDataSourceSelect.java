// SELECT TYPE IfcLightDistributionDataSourceSelect
public class IfcLightDistributionDataSourceSelect {
    public Object value;

    public IfcLightDistributionDataSourceSelect(Object value) {
        if (!(value instanceof IfcExternalReference || value instanceof IfcLightIntensityDistribution)) {
            throw new IllegalArgumentException("Value must be one of: IfcExternalReference, IfcLightIntensityDistribution");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
