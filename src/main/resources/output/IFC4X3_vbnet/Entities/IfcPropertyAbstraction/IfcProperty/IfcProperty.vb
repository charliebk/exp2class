Public Class IfcProperty Inherits IfcPropertyAbstraction
    Public Name As IfcIdentifier
    Public Specification As IfcText

    ' === EXTENDED BY ===
    ' IfcComplexProperty
    ' IfcSimpleProperty

    ' === INVERSE CLAUSES ===
    ' PartOfPset : SET [0:?] OF IfcPropertySet FOR HasProperties
    ' PropertyForDependance : SET [0:?] OF IfcPropertyDependencyRelationship FOR DependingProperty
    ' PropertyDependsOn : SET [0:?] OF IfcPropertyDependencyRelationship FOR DependantProperty
    ' PartOfComplex : SET [0:?] OF IfcComplexProperty FOR HasProperties
    ' HasConstraints : SET [0:?] OF IfcResourceConstraintRelationship FOR RelatedResourceObjects
    ' HasApprovals : SET [0:?] OF IfcResourceApprovalRelationship FOR RelatedResourceObjects
End Class
