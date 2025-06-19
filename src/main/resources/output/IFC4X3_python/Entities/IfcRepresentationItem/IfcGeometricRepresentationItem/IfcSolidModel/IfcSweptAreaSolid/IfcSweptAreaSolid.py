class IfcSweptAreaSolid(IfcSolidModel):
    def __init__(self):
        self.SweptArea: IfcProfileDef = None
        self.Position: IfcAxis2Placement3D = None

    # === EXTENDED BY ===
    # IfcDirectrixCurveSweptAreaSolid
    # IfcExtrudedAreaSolid
    # IfcRevolvedAreaSolid

    # === WHERE CLAUSES ===
    # SweptAreaType : SweptArea.ProfileType = IfcProfileTypeEnum.Area
