' SELECT TYPE IfcMeasureValue
' Options:
' - IfcAmountOfSubstanceMeasure
' - IfcAreaMeasure
' - IfcComplexNumber
' - IfcContextDependentMeasure
' - IfcCountMeasure
' - IfcDescriptiveMeasure
' - IfcElectricCurrentMeasure
' - IfcLengthMeasure
' - IfcLuminousIntensityMeasure
' - IfcMassMeasure
' - IfcNonNegativeLengthMeasure
' - IfcNormalisedRatioMeasure
' - IfcNumericMeasure
' - IfcParameterValue
' - IfcPlaneAngleMeasure
' - IfcPositiveLengthMeasure
' - IfcPositivePlaneAngleMeasure
' - IfcPositiveRatioMeasure
' - IfcRatioMeasure
' - IfcSolidAngleMeasure
' - IfcThermodynamicTemperatureMeasure
' - IfcTimeMeasure
' - IfcVolumeMeasure
Public Class IfcMeasureValue
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcAmountOfSubstanceMeasure OrElse TypeOf value Is IfcAreaMeasure OrElse TypeOf value Is IfcComplexNumber OrElse TypeOf value Is IfcContextDependentMeasure OrElse TypeOf value Is IfcCountMeasure OrElse TypeOf value Is IfcDescriptiveMeasure OrElse TypeOf value Is IfcElectricCurrentMeasure OrElse TypeOf value Is IfcLengthMeasure OrElse TypeOf value Is IfcLuminousIntensityMeasure OrElse TypeOf value Is IfcMassMeasure OrElse TypeOf value Is IfcNonNegativeLengthMeasure OrElse TypeOf value Is IfcNormalisedRatioMeasure OrElse TypeOf value Is IfcNumericMeasure OrElse TypeOf value Is IfcParameterValue OrElse TypeOf value Is IfcPlaneAngleMeasure OrElse TypeOf value Is IfcPositiveLengthMeasure OrElse TypeOf value Is IfcPositivePlaneAngleMeasure OrElse TypeOf value Is IfcPositiveRatioMeasure OrElse TypeOf value Is IfcRatioMeasure OrElse TypeOf value Is IfcSolidAngleMeasure OrElse TypeOf value Is IfcThermodynamicTemperatureMeasure OrElse TypeOf value Is IfcTimeMeasure OrElse TypeOf value Is IfcVolumeMeasure) Then
            Throw New ArgumentException("Value must be one of: IfcAmountOfSubstanceMeasure, IfcAreaMeasure, IfcComplexNumber, IfcContextDependentMeasure, IfcCountMeasure, IfcDescriptiveMeasure, IfcElectricCurrentMeasure, IfcLengthMeasure, IfcLuminousIntensityMeasure, IfcMassMeasure, IfcNonNegativeLengthMeasure, IfcNormalisedRatioMeasure, IfcNumericMeasure, IfcParameterValue, IfcPlaneAngleMeasure, IfcPositiveLengthMeasure, IfcPositivePlaneAngleMeasure, IfcPositiveRatioMeasure, IfcRatioMeasure, IfcSolidAngleMeasure, IfcThermodynamicTemperatureMeasure, IfcTimeMeasure, IfcVolumeMeasure")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
