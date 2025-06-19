public class IfcBSplineSurface extends IfcBoundedSurface {
    public IfcInteger UDegree;
    public IfcInteger VDegree;
    public List<List<IfcCartesianPoint>> ControlPointsList;
    public IfcBSplineSurfaceForm SurfaceForm;
    public IfcLogical UClosed;
    public IfcLogical VClosed;
    public IfcLogical SelfIntersect;

    // === EXTENDED BY ===
    // IfcBSplineSurfaceWithKnots

    // === DERIVE CLAUSES ===
    // UUpper : IfcInteger := SIZEOF(ControlPointsList) - 1
    // VUpper : IfcInteger := SIZEOF(ControlPointsList[1]) - 1
    // ControlPoints : ARRAY [0:UUpper] OF ARRAY [0:VUpper] OF IfcCartesianPoint := IfcMakeArrayOfArray(ControlPointsList, 0,UUpper,0,VUpper)
}
