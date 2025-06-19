Public Class IfcMaterialDefinition

    ' === EXTENDED BY ===
    ' IfcMaterial
    ' IfcMaterialConstituent
    ' IfcMaterialConstituentSet
    ' IfcMaterialLayer
    ' IfcMaterialLayerSet
    ' IfcMaterialProfile
    ' IfcMaterialProfileSet

    ' === INVERSE CLAUSES ===
    ' AssociatedTo : SET [0:?] OF IfcRelAssociatesMaterial FOR RelatingMaterial
    ' HasExternalReferences : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
    ' HasProperties : SET [0:?] OF IfcMaterialProperties FOR Material
End Class
