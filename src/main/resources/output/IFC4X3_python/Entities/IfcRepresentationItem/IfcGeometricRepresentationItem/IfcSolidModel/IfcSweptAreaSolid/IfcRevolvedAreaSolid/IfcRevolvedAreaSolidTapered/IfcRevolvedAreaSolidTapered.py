class IfcRevolvedAreaSolidTapered(IfcRevolvedAreaSolid):
    def __init__(self):
        self.EndSweptArea: IfcProfileDef = None

    # === WHERE CLAUSES ===
    # CorrectProfileAssignment : IfcTaperedSweptAreaProfiles(SELF\IfcSweptAreaSolid.SweptArea, SELF.EndSweptArea)
