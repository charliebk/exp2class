public class IfcSweptDiskSolidPolygonal : IfcSweptDiskSolid
{
    public IfcNonNegativeLengthMeasure FilletRadius { get; set; }

    // === WHERE CLAUSES ===
    // CorrectRadii : NOT(EXISTS(FilletRadius)) OR (FilletRadius >= SELF\IfcSweptDiskSolid.Radius)
    // DirectrixIsPolyline : ('IFC4X3_DEV_73740fe4.IFCPOLYLINE' IN TYPEOF(SELF\IfcSweptDiskSolid.Directrix)) OR (('IFC4X3_DEV_73740fe4.IFCINDEXEDPOLYCURVE' IN TYPEOF(SELF\IfcSweptDiskSolid.Directrix)) AND NOT(EXISTS(SELF\IfcSweptDiskSolid.Directrix\IfcIndexedPolyCurve.Segments)))
}
