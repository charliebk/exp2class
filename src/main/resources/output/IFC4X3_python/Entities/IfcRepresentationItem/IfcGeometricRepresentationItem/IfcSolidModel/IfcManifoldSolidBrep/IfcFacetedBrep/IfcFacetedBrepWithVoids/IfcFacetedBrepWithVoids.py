class IfcFacetedBrepWithVoids(IfcFacetedBrep):
    def __init__(self):
        self.Voids: SET [1:?] OF IfcClosedShell = None
