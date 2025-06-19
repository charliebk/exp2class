' SELECT TYPE IfcHatchLineDistanceSelect
' Options:
' - IfcPositiveLengthMeasure
' - IfcVector
Public Class IfcHatchLineDistanceSelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcPositiveLengthMeasure OrElse TypeOf value Is IfcVector) Then
            Throw New ArgumentException("Value must be one of: IfcPositiveLengthMeasure, IfcVector")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
