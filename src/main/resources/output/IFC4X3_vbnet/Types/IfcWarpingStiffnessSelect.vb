' SELECT TYPE IfcWarpingStiffnessSelect
' Options:
' - IfcBoolean
' - IfcWarpingMomentMeasure
Public Class IfcWarpingStiffnessSelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcBoolean OrElse TypeOf value Is IfcWarpingMomentMeasure) Then
            Throw New ArgumentException("Value must be one of: IfcBoolean, IfcWarpingMomentMeasure")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
