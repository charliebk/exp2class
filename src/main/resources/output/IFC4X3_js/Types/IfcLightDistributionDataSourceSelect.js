// SELECT TYPE IfcLightDistributionDataSourceSelect
// Options:
// - IfcExternalReference
// - IfcLightIntensityDistribution
class IfcLightDistributionDataSourceSelect {
    constructor(value) {
        if (!(value instanceof IfcExternalReference || value instanceof IfcLightIntensityDistribution)) {
            throw new Error("Value must be one of: IfcExternalReference, IfcLightIntensityDistribution");
        }
        this.value = value;
    }

    getValueAs(TypeClass) {
        if (this.value instanceof TypeClass) {
            return this.value;
        } else {
            throw new Error("Stored value is not of the requested type");
        }
    }
}
