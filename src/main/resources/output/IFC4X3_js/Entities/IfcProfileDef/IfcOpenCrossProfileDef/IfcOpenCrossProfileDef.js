class IfcOpenCrossProfileDef extends IfcProfileDef {
    constructor() {
        /** @type {IFCBOOLEAN} */
        this.HorizontalWidths = null;
        /** @type {IFCNONNEGATIVELENGTHMEASURE[]} */
        this.Widths = null;
        /** @type {IFCPLANEANGLEMEASURE[]} */
        this.Slopes = null;
        /** @type {IFCLABEL[]} */
        this.Tags = null;
        /** @type {IFCCARTESIANPOINT} */
        this.OffsetPoint = null;
    }

    // === WHERE CLAUSES ===
    // CorrectProfileType : SELF\IfcProfileDef.ProfileType = IfcProfileTypeEnum.CURVE
    // CorrespondingSlopeWidths : SIZEOF(Slopes) = SIZEOF(Widths)
    // CorrespondingTags : (NOT EXISTS (Tags)) OR (SIZEOF(Tags) = (SIZEOF(Slopes) + 1))
}
