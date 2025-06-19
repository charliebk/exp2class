class IfcAdvancedBrepWithVoids(IfcAdvancedBrep):
    def __init__(self):
        self.Voids: SET [1:?] OF IfcClosedShell = None

    # === WHERE CLAUSES ===
    # VoidsHaveAdvancedFaces : SIZEOF (QUERY (Vsh <* Voids | SIZEOF (QUERY (Afs <* Vsh.CfsFaces | (NOT ('IFC4X3_DEV_73740fe4.IFCADVANCEDFACE' IN TYPEOF(Afs))) )) = 0 )) = 0
