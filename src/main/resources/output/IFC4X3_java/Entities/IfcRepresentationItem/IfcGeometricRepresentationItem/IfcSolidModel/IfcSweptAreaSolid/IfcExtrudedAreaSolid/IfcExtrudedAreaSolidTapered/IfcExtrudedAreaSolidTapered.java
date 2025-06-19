public class IfcExtrudedAreaSolidTapered extends IfcExtrudedAreaSolid {
    public IfcProfileDef EndSweptArea;

    // === WHERE CLAUSES ===
    // CorrectProfileAssignment : IfcTaperedSweptAreaProfiles(SELF\IfcSweptAreaSolid.SweptArea, SELF.EndSweptArea)
}
