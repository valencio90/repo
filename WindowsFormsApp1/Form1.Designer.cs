namespace WindowsFormsApp1
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.subjects = new System.Windows.Forms.ComboBox();
            this.marksTextBox = new System.Windows.Forms.TextBox();
            this.subjectsLabel = new System.Windows.Forms.Label();
            this.submitButton = new System.Windows.Forms.Button();
            this.totalDisplayTextBox = new System.Windows.Forms.TextBox();
            this.totalDisplay = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // subjects
            // 
            this.subjects.FormattingEnabled = true;
            this.subjects.Items.AddRange(new object[] {
            "DC",
            "ED",
            "SMMA",
            "TWS",
            "SE"});
            this.subjects.Location = new System.Drawing.Point(202, 35);
            this.subjects.Name = "subjects";
            this.subjects.Size = new System.Drawing.Size(121, 24);
            this.subjects.TabIndex = 0;
            // 
            // marksTextBox
            // 
            this.marksTextBox.Location = new System.Drawing.Point(85, 37);
            this.marksTextBox.Name = "marksTextBox";
            this.marksTextBox.Size = new System.Drawing.Size(100, 22);
            this.marksTextBox.TabIndex = 1;
            // 
            // subjectsLabel
            // 
            this.subjectsLabel.AutoSize = true;
            this.subjectsLabel.Location = new System.Drawing.Point(12, 43);
            this.subjectsLabel.Name = "subjectsLabel";
            this.subjectsLabel.Size = new System.Drawing.Size(59, 16);
            this.subjectsLabel.TabIndex = 2;
            this.subjectsLabel.Text = "Subjects";
            // 
            // submitButton
            // 
            this.submitButton.Location = new System.Drawing.Point(202, 112);
            this.submitButton.Name = "submitButton";
            this.submitButton.Size = new System.Drawing.Size(75, 23);
            this.submitButton.TabIndex = 3;
            this.submitButton.Text = "submit";
            this.submitButton.UseVisualStyleBackColor = true;
            this.submitButton.Click += new System.EventHandler(this.submitButton_Click);
            // 
            // totalDisplayTextBox
            // 
            this.totalDisplayTextBox.Location = new System.Drawing.Point(85, 112);
            this.totalDisplayTextBox.Name = "totalDisplayTextBox";
            this.totalDisplayTextBox.Size = new System.Drawing.Size(100, 22);
            this.totalDisplayTextBox.TabIndex = 4;
            // 
            // totalDisplay
            // 
            this.totalDisplay.AutoSize = true;
            this.totalDisplay.Location = new System.Drawing.Point(15, 118);
            this.totalDisplay.Name = "totalDisplay";
            this.totalDisplay.Size = new System.Drawing.Size(38, 16);
            this.totalDisplay.TabIndex = 5;
            this.totalDisplay.Text = "Total";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.totalDisplay);
            this.Controls.Add(this.totalDisplayTextBox);
            this.Controls.Add(this.submitButton);
            this.Controls.Add(this.subjectsLabel);
            this.Controls.Add(this.marksTextBox);
            this.Controls.Add(this.subjects);
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ComboBox subjects;
        private System.Windows.Forms.TextBox marksTextBox;
        private System.Windows.Forms.Label subjectsLabel;
        private System.Windows.Forms.Button submitButton;
        private System.Windows.Forms.TextBox totalDisplayTextBox;
        private System.Windows.Forms.Label totalDisplay;
    }
}

