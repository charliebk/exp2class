public class IfcBSplineSurface : IfcBoundedSurface
{
    public IfcInteger UDegree { get; set; }
    public IfcInteger VDegree { get; set; }
    public List<List<IfcCartesianPoint>> ControlPointsList { get; set; }
    public IfcBSplineSurfaceForm SurfaceForm { get; set; }
    public IfcLogical UClosed { get; set; }
    public IfcLogical VClosed { get; set; }
    public IfcLogical SelfIntersect { get; set; }

    // === EXTENDED BY ===
    // IfcBSplineSurfaceWithKnots

    // === DERIVE CLAUSES ===
    // UUpper : IfcInteger := SIZEOF(ControlPointsList) - 1
    // VUpper : IfcInteger := SIZEOF(ControlPointsList[1]) - 1
    // ControlPoints : ARRAY [0:UUpper] OF ARRAY [0:VUpper] OF IfcCartesianPoint := IfcMakeArrayOfArray(ControlPointsList, 0,UUpper,0,VUpper)
}
