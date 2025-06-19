' SELECT TYPE IfcResourceObjectSelect
' Options:
' - IfcActorRole
' - IfcAppliedValue
' - IfcApproval
' - IfcConstraint
' - IfcContextDependentUnit
' - IfcConversionBasedUnit
' - IfcExternalInformation
' - IfcExternalReference
' - IfcMaterialDefinition
' - IfcOrganization
' - IfcPerson
' - IfcPersonAndOrganization
' - IfcPhysicalQuantity
' - IfcProfileDef
' - IfcPropertyAbstraction
' - IfcShapeAspect
' - IfcTimeSeries
Public Class IfcResourceObjectSelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcActorRole OrElse TypeOf value Is IfcAppliedValue OrElse TypeOf value Is IfcApproval OrElse TypeOf value Is IfcConstraint OrElse TypeOf value Is IfcContextDependentUnit OrElse TypeOf value Is IfcConversionBasedUnit OrElse TypeOf value Is IfcExternalInformation OrElse TypeOf value Is IfcExternalReference OrElse TypeOf value Is IfcMaterialDefinition OrElse TypeOf value Is IfcOrganization OrElse TypeOf value Is IfcPerson OrElse TypeOf value Is IfcPersonAndOrganization OrElse TypeOf value Is IfcPhysicalQuantity OrElse TypeOf value Is IfcProfileDef OrElse TypeOf value Is IfcPropertyAbstraction OrElse TypeOf value Is IfcShapeAspect OrElse TypeOf value Is IfcTimeSeries) Then
            Throw New ArgumentException("Value must be one of: IfcActorRole, IfcAppliedValue, IfcApproval, IfcConstraint, IfcContextDependentUnit, IfcConversionBasedUnit, IfcExternalInformation, IfcExternalReference, IfcMaterialDefinition, IfcOrganization, IfcPerson, IfcPersonAndOrganization, IfcPhysicalQuantity, IfcProfileDef, IfcPropertyAbstraction, IfcShapeAspect, IfcTimeSeries")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
