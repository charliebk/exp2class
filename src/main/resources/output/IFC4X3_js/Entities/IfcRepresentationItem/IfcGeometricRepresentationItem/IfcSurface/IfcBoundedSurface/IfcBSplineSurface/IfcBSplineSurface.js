class IfcBSplineSurface extends IfcBoundedSurface {
    constructor() {
        /** @type {IFCINTEGER} */
        this.UDegree = null;
        /** @type {IFCINTEGER} */
        this.VDegree = null;
        /** @type {IFCCARTESIANPOINT[][]} */
        this.ControlPointsList = null;
        /** @type {IFCBSPLINESURFACEFORM} */
        this.SurfaceForm = null;
        /** @type {IFCLOGICAL} */
        this.UClosed = null;
        /** @type {IFCLOGICAL} */
        this.VClosed = null;
        /** @type {IFCLOGICAL} */
        this.SelfIntersect = null;
    }

    // === EXTENDED BY ===
    // IfcBSplineSurfaceWithKnots

    // === DERIVE CLAUSES ===
    // UUpper : IfcInteger := SIZEOF(ControlPointsList) - 1
    // VUpper : IfcInteger := SIZEOF(ControlPointsList[1]) - 1
    // ControlPoints : ARRAY [0:UUpper] OF ARRAY [0:VUpper] OF IfcCartesianPoint := IfcMakeArrayOfArray(ControlPointsList, 0,UUpper,0,VUpper)
}
