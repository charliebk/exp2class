// SELECT TYPE IfcLightDistributionDataSourceSelect
public class IfcLightDistributionDataSourceSelect {
    public object Value { get; }

    public IfcLightDistributionDataSourceSelect(object value) {
        if (!(value is IfcExternalReference || value is IfcLightIntensityDistribution))
        {
            throw new ArgumentException("Value must be one of: IfcExternalReference, IfcLightIntensityDistribution");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
