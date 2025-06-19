' SELECT TYPE IfcActorSelect
' Options:
' - IfcOrganization
' - IfcPerson
' - IfcPersonAndOrganization
Public Class IfcActorSelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcOrganization OrElse TypeOf value Is IfcPerson OrElse TypeOf value Is IfcPersonAndOrganization) Then
            Throw New ArgumentException("Value must be one of: IfcOrganization, IfcPerson, IfcPersonAndOrganization")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
