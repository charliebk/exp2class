public class IfcAdvancedBrep extends IfcManifoldSolidBrep {

    // === EXTENDED BY ===
    // IfcAdvancedBrepWithVoids

    // === WHERE CLAUSES ===
    // HasAdvancedFaces : SIZEOF(QUERY(Afs <* SELF\IfcManifoldSolidBrep.Outer.CfsFaces | (NOT ('IFC4X3_DEV_73740fe4.IFCADVANCEDFACE' IN TYPEOF(Afs))) )) = 0
}
