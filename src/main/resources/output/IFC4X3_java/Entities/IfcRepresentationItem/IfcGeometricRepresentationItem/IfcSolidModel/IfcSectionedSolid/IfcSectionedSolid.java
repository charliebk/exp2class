public class IfcSectionedSolid extends IfcSolidModel {
    public IfcCurve Directrix;
    public List<IfcProfileDef> CrossSections;

    // === EXTENDED BY ===
    // IfcSectionedSolidHorizontal

    // === WHERE CLAUSES ===
    // ConsistentProfileTypes : SIZEOF(QUERY(temp <* CrossSections | CrossSections[1].ProfileType <> temp.ProfileType)) = 0
    // DirectrixIs3D : Directrix.Dim = 3
    // SectionsSameType : SIZEOF(QUERY(temp <* CrossSections | TYPEOF(CrossSections[1]) :<>: TYPEOF(temp))) = 0
}
