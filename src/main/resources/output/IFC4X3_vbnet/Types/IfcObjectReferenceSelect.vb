' SELECT TYPE IfcObjectReferenceSelect
' Options:
' - IfcAddress
' - IfcAppliedValue
' - IfcExternalReference
' - IfcMaterialDefinition
' - IfcOrganization
' - IfcPerson
' - IfcPersonAndOrganization
' - IfcTable
' - IfcTimeSeries
Public Class IfcObjectReferenceSelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcAddress OrElse TypeOf value Is IfcAppliedValue OrElse TypeOf value Is IfcExternalReference OrElse TypeOf value Is IfcMaterialDefinition OrElse TypeOf value Is IfcOrganization OrElse TypeOf value Is IfcPerson OrElse TypeOf value Is IfcPersonAndOrganization OrElse TypeOf value Is IfcTable OrElse TypeOf value Is IfcTimeSeries) Then
            Throw New ArgumentException("Value must be one of: IfcAddress, IfcAppliedValue, IfcExternalReference, IfcMaterialDefinition, IfcOrganization, IfcPerson, IfcPersonAndOrganization, IfcTable, IfcTimeSeries")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
