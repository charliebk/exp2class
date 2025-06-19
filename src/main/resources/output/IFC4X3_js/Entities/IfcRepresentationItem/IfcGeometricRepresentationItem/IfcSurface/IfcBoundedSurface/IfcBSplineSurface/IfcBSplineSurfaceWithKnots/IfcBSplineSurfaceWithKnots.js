class IfcBSplineSurfaceWithKnots extends IfcBSplineSurface {
    constructor() {
        /** @type {IFCINTEGER[]} */
        this.UMultiplicities = null;
        /** @type {IFCINTEGER[]} */
        this.VMultiplicities = null;
        /** @type {IFCPARAMETERVALUE[]} */
        this.UKnots = null;
        /** @type {IFCPARAMETERVALUE[]} */
        this.VKnots = null;
        /** @type {IFCKNOTTYPE} */
        this.KnotSpec = null;
    }

    // === EXTENDED BY ===
    // IfcRationalBSplineSurfaceWithKnots

    // === WHERE CLAUSES ===
    // CorrespondingULists : SIZEOF(UMultiplicities) = KnotUUpper
    // CorrespondingVLists : SIZEOF(VMultiplicities) = KnotVUpper
    // UDirectionConstraints : IfcConstraintsParamBSpline ( SELF\IfcBSplineSurface.UDegree, KnotUUpper, SELF\IfcBSplineSurface.UUpper, UMultiplicities, UKnots)
    // VDirectionConstraints : IfcConstraintsParamBSpline ( SELF\IfcBSplineSurface.VDegree, KnotVUpper, SELF\IfcBSplineSurface.VUpper, VMultiplicities, VKnots)

    // === DERIVE CLAUSES ===
    // KnotVUpper : IfcInteger := SIZEOF(VKnots)
    // KnotUUpper : IfcInteger := SIZEOF(UKnots)
}
