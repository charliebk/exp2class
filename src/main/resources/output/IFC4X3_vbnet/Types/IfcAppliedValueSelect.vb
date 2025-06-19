' SELECT TYPE IfcAppliedValueSelect
' Options:
' - IfcMeasureWithUnit
' - IfcReference
' - IfcValue
Public Class IfcAppliedValueSelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcMeasureWithUnit OrElse TypeOf value Is IfcReference OrElse TypeOf value Is IfcValue) Then
            Throw New ArgumentException("Value must be one of: IfcMeasureWithUnit, IfcReference, IfcValue")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
