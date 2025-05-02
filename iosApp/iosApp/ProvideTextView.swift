//
//  ProvideTextView.swift
//  iosApp
//
//  Created by Nataliia Mantrova on 26.04.2025.
//  Copyright © 2025 orgName. All rights reserved.
//

import SwiftUI

struct ProvideTextView: View {
    @State var text: String
    var onDone: (String) -> Void
    var onDismiss: () -> Void
    
    @State private var showScreen = true

    var body: some View {
        ComposeView()
            .padding()
            .fullScreenCover(isPresented: $showScreen, onDismiss: {
                showScreen = false
                onDismiss()
            }) {
                VStack(spacing: 40) {
                    
                    TextField("Enter text", text: $text)
                        .textFieldStyle(.roundedBorder)
                        .padding()

                    Button("Done") {
                        showScreen = false
                        onDone(text)
                        onDismiss()
                    }
                }
            }
    }
}


