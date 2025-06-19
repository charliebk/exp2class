Public Class IfcSystem Inherits IfcGroup

    ' === EXTENDED BY ===
    ' IfcBuildingSystem
    ' IfcBuiltSystem
    ' IfcDistributionSystem
    ' IfcStructuralAnalysisModel
    ' IfcZone

    ' === INVERSE CLAUSES ===
    ' ServicesBuildings : SET [0:1] OF IfcRelServicesBuildings FOR RelatingSystem
    ' ServicesFacilities : SET [0:?] OF IfcRelReferencedInSpatialStructure FOR RelatedElements
End Class
