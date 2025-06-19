Public Class IfcRepresentationMap
    Public MappingOrigin As IfcAxis2Placement
    Public MappedRepresentation As IfcRepresentation

    ' === INVERSE CLAUSES ===
    ' HasShapeAspects : SET [0:?] OF IfcShapeAspect FOR PartOfProductDefinitionShape
    ' MapUsage : SET [0:?] OF IfcMappedItem FOR MappingSource

    ' === WHERE CLAUSES ===
    ' ApplicableMappedRepr : 'IFC4X3_DEV_73740fe4.IFCSHAPEMODEL' IN TYPEOF(MappedRepresentation)
End Class
