' SELECT TYPE IfcAxis2Placement
' Options:
' - IfcAxis2Placement2D
' - IfcAxis2Placement3D
Public Class IfcAxis2Placement
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcAxis2Placement2D OrElse TypeOf value Is IfcAxis2Placement3D) Then
            Throw New ArgumentException("Value must be one of: IfcAxis2Placement2D, IfcAxis2Placement3D")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
