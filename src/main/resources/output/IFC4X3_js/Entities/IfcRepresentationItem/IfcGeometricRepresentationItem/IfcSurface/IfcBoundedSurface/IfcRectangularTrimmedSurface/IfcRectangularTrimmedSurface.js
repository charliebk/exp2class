class IfcRectangularTrimmedSurface extends IfcBoundedSurface {
    constructor() {
        /** @type {IFCSURFACE} */
        this.BasisSurface = null;
        /** @type {IFCPARAMETERVALUE} */
        this.U1 = null;
        /** @type {IFCPARAMETERVALUE} */
        this.V1 = null;
        /** @type {IFCPARAMETERVALUE} */
        this.U2 = null;
        /** @type {IFCPARAMETERVALUE} */
        this.V2 = null;
        /** @type {IFCBOOLEAN} */
        this.Usense = null;
        /** @type {IFCBOOLEAN} */
        this.Vsense = null;
    }

    // === WHERE CLAUSES ===
    // U1AndU2Different : U1 <> U2
    // UsenseCompatible : (('IFC4X3_DEV_73740fe4.IFCELEMENTARYSURFACE' IN TYPEOF(BasisSurface)) AND (NOT ('IFC4X3_DEV_73740fe4.IFCPLANE' IN TYPEOF(BasisSurface)))) OR ('IFC4X3_DEV_73740fe4.IFCSURFACEOFREVOLUTION' IN TYPEOF(BasisSurface)) OR (Usense = (U2 > U1))
    // V1AndV2Different : V1 <> V2
    // VsenseCompatible : Vsense = (V2 > V1)
}
