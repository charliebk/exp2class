class IfcTextStyleFontModel extends IfcPreDefinedTextFont {
    constructor() {
        /** @type {IFCTEXTFONTNAME[]} */
        this.FontFamily = null;
        /** @type {IFCFONTSTYLE} */
        this.FontStyle = null;
        /** @type {IFCFONTVARIANT} */
        this.FontVariant = null;
        /** @type {IFCFONTWEIGHT} */
        this.FontWeight = null;
        /** @type {IFCSIZESELECT} */
        this.FontSize = null;
    }

    // === WHERE CLAUSES ===
    // MeasureOfFontSize : ('IFC4X3_DEV_73740fe4.IFCLENGTHMEASURE' IN TYPEOF(SELF.FontSize)) AND (SELF.FontSize > 0.)
}
