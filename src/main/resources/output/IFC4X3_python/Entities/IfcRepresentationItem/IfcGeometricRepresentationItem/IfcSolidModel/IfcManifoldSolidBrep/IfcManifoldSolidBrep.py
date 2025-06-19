class IfcManifoldSolidBrep(IfcSolidModel):
    def __init__(self):
        self.Outer: IfcClosedShell = None

    # === EXTENDED BY ===
    # IfcAdvancedBrep
    # IfcFacetedBrep
