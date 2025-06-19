public class IfcSweptAreaSolid : IfcSolidModel
{
    public IfcProfileDef SweptArea { get; set; }
    public IfcAxis2Placement3D Position { get; set; }

    // === EXTENDED BY ===
    // IfcDirectrixCurveSweptAreaSolid
    // IfcExtrudedAreaSolid
    // IfcRevolvedAreaSolid

    // === WHERE CLAUSES ===
    // SweptAreaType : SweptArea.ProfileType = IfcProfileTypeEnum.Area
}
