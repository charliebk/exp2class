class IfcConnectedFaceSet(IfcTopologicalRepresentationItem):
    def __init__(self):
        self.CfsFaces: SET [1:?] OF IfcFace = None

    # === EXTENDED BY ===
    # IfcClosedShell
    # IfcOpenShell
