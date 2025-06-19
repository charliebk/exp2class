// SELECT TYPE IfcMeasureValue
public class IfcMeasureValue {
    public object Value { get; }

    public IfcMeasureValue(object value) {
        if (!(value is IfcAmountOfSubstanceMeasure || value is IfcAreaMeasure || value is IfcComplexNumber || value is IfcContextDependentMeasure || value is IfcCountMeasure || value is IfcDescriptiveMeasure || value is IfcElectricCurrentMeasure || value is IfcLengthMeasure || value is IfcLuminousIntensityMeasure || value is IfcMassMeasure || value is IfcNonNegativeLengthMeasure || value is IfcNormalisedRatioMeasure || value is IfcNumericMeasure || value is IfcParameterValue || value is IfcPlaneAngleMeasure || value is IfcPositiveLengthMeasure || value is IfcPositivePlaneAngleMeasure || value is IfcPositiveRatioMeasure || value is IfcRatioMeasure || value is IfcSolidAngleMeasure || value is IfcThermodynamicTemperatureMeasure || value is IfcTimeMeasure || value is IfcVolumeMeasure))
        {
            throw new ArgumentException("Value must be one of: IfcAmountOfSubstanceMeasure, IfcAreaMeasure, IfcComplexNumber, IfcContextDependentMeasure, IfcCountMeasure, IfcDescriptiveMeasure, IfcElectricCurrentMeasure, IfcLengthMeasure, IfcLuminousIntensityMeasure, IfcMassMeasure, IfcNonNegativeLengthMeasure, IfcNormalisedRatioMeasure, IfcNumericMeasure, IfcParameterValue, IfcPlaneAngleMeasure, IfcPositiveLengthMeasure, IfcPositivePlaneAngleMeasure, IfcPositiveRatioMeasure, IfcRatioMeasure, IfcSolidAngleMeasure, IfcThermodynamicTemperatureMeasure, IfcTimeMeasure, IfcVolumeMeasure");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
