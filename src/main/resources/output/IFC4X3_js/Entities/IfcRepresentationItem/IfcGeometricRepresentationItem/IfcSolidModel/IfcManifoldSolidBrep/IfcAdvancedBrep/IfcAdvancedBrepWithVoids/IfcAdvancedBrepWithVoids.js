class IfcAdvancedBrepWithVoids extends IfcAdvancedBrep {
    constructor() {
        /** @type {SET [1:?] OF IFCCLOSEDSHELL} */
        this.Voids = null;
    }

    // === WHERE CLAUSES ===
    // VoidsHaveAdvancedFaces : SIZEOF (QUERY (Vsh <* Voids | SIZEOF (QUERY (Afs <* Vsh.CfsFaces | (NOT ('IFC4X3_DEV_73740fe4.IFCADVANCEDFACE' IN TYPEOF(Afs))) )) = 0 )) = 0
}
