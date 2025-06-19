class IfcIndexedPolyCurve extends IfcBoundedCurve {
    constructor() {
        /** @type {IFCCARTESIANPOINTLIST} */
        this.Points = null;
        /** @type {IFCSEGMENTINDEXSELECT[]} */
        this.Segments = null;
        /** @type {IFCBOOLEAN} */
        this.SelfIntersect = null;
    }

    // === WHERE CLAUSES ===
    // Consecutive : NOT(EXISTS(Segments)) OR IfcConsecutiveSegments(Segments)
}
