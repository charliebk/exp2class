Public Class IfcAdvancedBrepWithVoids Inherits IfcAdvancedBrep
    Public Voids As SET [1:?] OF IfcClosedShell

    ' === WHERE CLAUSES ===
    ' VoidsHaveAdvancedFaces : SIZEOF (QUERY (Vsh <* Voids | SIZEOF (QUERY (Afs <* Vsh.CfsFaces | (NOT ('IFC4X3_DEV_73740fe4.IFCADVANCEDFACE' IN TYPEOF(Afs))) )) = 0 )) = 0
End Class
