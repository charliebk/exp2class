class IfcSystem(IfcGroup):
    def __init__(self):
        pass

    # === EXTENDED BY ===
    # IfcBuildingSystem
    # IfcBuiltSystem
    # IfcDistributionSystem
    # IfcStructuralAnalysisModel
    # IfcZone

    # === INVERSE CLAUSES ===
    # ServicesBuildings : SET [0:1] OF IfcRelServicesBuildings FOR RelatingSystem
    # ServicesFacilities : SET [0:?] OF IfcRelReferencedInSpatialStructure FOR RelatedElements
