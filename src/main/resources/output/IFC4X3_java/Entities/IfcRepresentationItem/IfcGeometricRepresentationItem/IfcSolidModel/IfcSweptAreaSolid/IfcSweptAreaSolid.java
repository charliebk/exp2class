public class IfcSweptAreaSolid extends IfcSolidModel {
    public IfcProfileDef SweptArea;
    public IfcAxis2Placement3D Position;

    // === EXTENDED BY ===
    // IfcDirectrixCurveSweptAreaSolid
    // IfcExtrudedAreaSolid
    // IfcRevolvedAreaSolid

    // === WHERE CLAUSES ===
    // SweptAreaType : SweptArea.ProfileType = IfcProfileTypeEnum.Area
}
