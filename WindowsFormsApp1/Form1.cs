﻿using Microsoft.Win32.SafeHandles;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApp1
{
    public partial class Form1 : Form
    {

        int DC = 0;
        int ED = 0;
        int SMMA = 0;
        int SE = 0;
        int TWS;
        int total = 0;

        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void submitButton_Click(object sender, EventArgs e)
        {
            if(subjects.SelectedIndex == 0)
            {
                DC = int.Parse(marksTextBox.Text);
                total += DC;
                totalDisplayTextBox.Text = total.ToString();
            }
            else if (subjects.SelectedIndex == 1)
            {
                ED = int.Parse(marksTextBox.Text);
                total += ED;
                totalDisplayTextBox.Text = total.ToString();
            }
            else if (subjects.SelectedIndex == 2)
            {
                SMMA = int.Parse(marksTextBox.Text);
                total += SMMA;
                totalDisplayTextBox.Text = total.ToString();
            }
            else if (subjects.SelectedIndex == 3)
            {
                TWS = int.Parse(marksTextBox.Text);
                total += TWS;
                totalDisplayTextBox.Text = total.ToString();
            }
            else
            {
                SE = int.Parse(marksTextBox.Text);
                total += SE;
                totalDisplayTextBox.Text = total.ToString();
            }
        }
    }
}
