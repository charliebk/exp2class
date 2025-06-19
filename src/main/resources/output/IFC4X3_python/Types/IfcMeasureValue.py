# SELECT TYPE IfcMeasureValue
# Options:
# - IfcAmountOfSubstanceMeasure
# - IfcAreaMeasure
# - IfcComplexNumber
# - IfcContextDependentMeasure
# - IfcCountMeasure
# - IfcDescriptiveMeasure
# - IfcElectricCurrentMeasure
# - IfcLengthMeasure
# - IfcLuminousIntensityMeasure
# - IfcMassMeasure
# - IfcNonNegativeLengthMeasure
# - IfcNormalisedRatioMeasure
# - IfcNumericMeasure
# - IfcParameterValue
# - IfcPlaneAngleMeasure
# - IfcPositiveLengthMeasure
# - IfcPositivePlaneAngleMeasure
# - IfcPositiveRatioMeasure
# - IfcRatioMeasure
# - IfcSolidAngleMeasure
# - IfcThermodynamicTemperatureMeasure
# - IfcTimeMeasure
# - IfcVolumeMeasure
class IfcMeasureValue:
    def __init__(self, value):
        if not isinstance(value, (IfcAmountOfSubstanceMeasure, IfcAreaMeasure, IfcComplexNumber, IfcContextDependentMeasure, IfcCountMeasure, IfcDescriptiveMeasure, IfcElectricCurrentMeasure, IfcLengthMeasure, IfcLuminousIntensityMeasure, IfcMassMeasure, IfcNonNegativeLengthMeasure, IfcNormalisedRatioMeasure, IfcNumericMeasure, IfcParameterValue, IfcPlaneAngleMeasure, IfcPositiveLengthMeasure, IfcPositivePlaneAngleMeasure, IfcPositiveRatioMeasure, IfcRatioMeasure, IfcSolidAngleMeasure, IfcThermodynamicTemperatureMeasure, IfcTimeMeasure, IfcVolumeMeasure)):
            raise TypeError("value must be one of: IfcAmountOfSubstanceMeasure, IfcAreaMeasure, IfcComplexNumber, IfcContextDependentMeasure, IfcCountMeasure, IfcDescriptiveMeasure, IfcElectricCurrentMeasure, IfcLengthMeasure, IfcLuminousIntensityMeasure, IfcMassMeasure, IfcNonNegativeLengthMeasure, IfcNormalisedRatioMeasure, IfcNumericMeasure, IfcParameterValue, IfcPlaneAngleMeasure, IfcPositiveLengthMeasure, IfcPositivePlaneAngleMeasure, IfcPositiveRatioMeasure, IfcRatioMeasure, IfcSolidAngleMeasure, IfcThermodynamicTemperatureMeasure, IfcTimeMeasure, IfcVolumeMeasure")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
