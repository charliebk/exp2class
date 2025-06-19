// SELECT TYPE IfcMeasureValue
// Options:
// - IfcAmountOfSubstanceMeasure
// - IfcAreaMeasure
// - IfcComplexNumber
// - IfcContextDependentMeasure
// - IfcCountMeasure
// - IfcDescriptiveMeasure
// - IfcElectricCurrentMeasure
// - IfcLengthMeasure
// - IfcLuminousIntensityMeasure
// - IfcMassMeasure
// - IfcNonNegativeLengthMeasure
// - IfcNormalisedRatioMeasure
// - IfcNumericMeasure
// - IfcParameterValue
// - IfcPlaneAngleMeasure
// - IfcPositiveLengthMeasure
// - IfcPositivePlaneAngleMeasure
// - IfcPositiveRatioMeasure
// - IfcRatioMeasure
// - IfcSolidAngleMeasure
// - IfcThermodynamicTemperatureMeasure
// - IfcTimeMeasure
// - IfcVolumeMeasure
class IfcMeasureValue {
    constructor(value) {
        if (!(value instanceof IfcAmountOfSubstanceMeasure || value instanceof IfcAreaMeasure || value instanceof IfcComplexNumber || value instanceof IfcContextDependentMeasure || value instanceof IfcCountMeasure || value instanceof IfcDescriptiveMeasure || value instanceof IfcElectricCurrentMeasure || value instanceof IfcLengthMeasure || value instanceof IfcLuminousIntensityMeasure || value instanceof IfcMassMeasure || value instanceof IfcNonNegativeLengthMeasure || value instanceof IfcNormalisedRatioMeasure || value instanceof IfcNumericMeasure || value instanceof IfcParameterValue || value instanceof IfcPlaneAngleMeasure || value instanceof IfcPositiveLengthMeasure || value instanceof IfcPositivePlaneAngleMeasure || value instanceof IfcPositiveRatioMeasure || value instanceof IfcRatioMeasure || value instanceof IfcSolidAngleMeasure || value instanceof IfcThermodynamicTemperatureMeasure || value instanceof IfcTimeMeasure || value instanceof IfcVolumeMeasure)) {
            throw new Error("Value must be one of: IfcAmountOfSubstanceMeasure, IfcAreaMeasure, IfcComplexNumber, IfcContextDependentMeasure, IfcCountMeasure, IfcDescriptiveMeasure, IfcElectricCurrentMeasure, IfcLengthMeasure, IfcLuminousIntensityMeasure, IfcMassMeasure, IfcNonNegativeLengthMeasure, IfcNormalisedRatioMeasure, IfcNumericMeasure, IfcParameterValue, IfcPlaneAngleMeasure, IfcPositiveLengthMeasure, IfcPositivePlaneAngleMeasure, IfcPositiveRatioMeasure, IfcRatioMeasure, IfcSolidAngleMeasure, IfcThermodynamicTemperatureMeasure, IfcTimeMeasure, IfcVolumeMeasure");
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
