class IfcBoxedHalfSpace extends IfcHalfSpaceSolid {
    constructor() {
        /** @type {IFCBOUNDINGBOX} */
        this.Enclosure = null;
    }

    // === WHERE CLAUSES ===
    // UnboundedSurface : NOT ('IFC4X3_DEV_73740fe4.IFCCURVEBOUNDEDPLANE' IN TYPEOF(SELF\IfcHalfSpaceSolid.BaseSurface))
}
