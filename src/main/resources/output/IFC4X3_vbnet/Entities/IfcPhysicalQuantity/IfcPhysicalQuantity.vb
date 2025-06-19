Public Class IfcPhysicalQuantity
    Public Name As IfcLabel
    Public Description As IfcText

    ' === EXTENDED BY ===
    ' IfcPhysicalComplexQuantity
    ' IfcPhysicalSimpleQuantity

    ' === INVERSE CLAUSES ===
    ' HasExternalReferences : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
    ' PartOfComplex : SET [0:1] OF IfcPhysicalComplexQuantity FOR HasQuantities
End Class
