Public Class IfcTypeObject Inherits IfcObjectDefinition
    Public ApplicableOccurrence As IfcIdentifier
    Public HasPropertySets As SET [1:?] OF IfcPropertySetDefinition

    ' === EXTENDED BY ===
    ' IfcTypeProcess
    ' IfcTypeProduct
    ' IfcTypeResource

    ' === INVERSE CLAUSES ===
    ' Types : SET [0:1] OF IfcRelDefinesByType FOR RelatingType

    ' === WHERE CLAUSES ===
    ' NameRequired : EXISTS(SELF\IfcRoot.Name)
    ' UniquePropertySetNames : (NOT(EXISTS(HasPropertySets))) OR IfcUniquePropertySetNames(HasPropertySets)
End Class
