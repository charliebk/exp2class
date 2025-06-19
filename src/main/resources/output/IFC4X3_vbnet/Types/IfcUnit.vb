' SELECT TYPE IfcUnit
' Options:
' - IfcDerivedUnit
' - IfcMonetaryUnit
' - IfcNamedUnit
Public Class IfcUnit
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcDerivedUnit OrElse TypeOf value Is IfcMonetaryUnit OrElse TypeOf value Is IfcNamedUnit) Then
            Throw New ArgumentException("Value must be one of: IfcDerivedUnit, IfcMonetaryUnit, IfcNamedUnit")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
