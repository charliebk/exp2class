public class IfcAdvancedBrepWithVoids : IfcAdvancedBrep
{
    public SET [1:?] OF IfcClosedShell Voids { get; set; }

    // === WHERE CLAUSES ===
    // VoidsHaveAdvancedFaces : SIZEOF (QUERY (Vsh <* Voids | SIZEOF (QUERY (Afs <* Vsh.CfsFaces | (NOT ('IFC4X3_DEV_73740fe4.IFCADVANCEDFACE' IN TYPEOF(Afs))) )) = 0 )) = 0
}
