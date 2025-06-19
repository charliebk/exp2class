' SELECT TYPE IfcSizeSelect
' Options:
' - IfcDescriptiveMeasure
' - IfcLengthMeasure
' - IfcNormalisedRatioMeasure
' - IfcPositiveLengthMeasure
' - IfcPositiveRatioMeasure
' - IfcRatioMeasure
Public Class IfcSizeSelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcDescriptiveMeasure OrElse TypeOf value Is IfcLengthMeasure OrElse TypeOf value Is IfcNormalisedRatioMeasure OrElse TypeOf value Is IfcPositiveLengthMeasure OrElse TypeOf value Is IfcPositiveRatioMeasure OrElse TypeOf value Is IfcRatioMeasure) Then
            Throw New ArgumentException("Value must be one of: IfcDescriptiveMeasure, IfcLengthMeasure, IfcNormalisedRatioMeasure, IfcPositiveLengthMeasure, IfcPositiveRatioMeasure, IfcRatioMeasure")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
