import './globals.css';

import Link from 'next/link';
import { NavItem } from '@/app/components/NavItem';

export default function RootLayout({
  children
}: {
  children: React.ReactNode;
}) {
  return (
    <html lang="en" className="h-full bg-gray-50">
      <body>
        <div className="grid min-h-screen w-full lg:grid-cols-[280px_1fr]">
          <div className="hidden border-r bg-gray-100/40 lg:block dark:bg-gray-800/40">
            <div className="flex h-full max-h-screen flex-col gap-2">
              <div className="flex h-[60px] items-center border-b px-5">
                <Link
                  className="flex items-center gap-2 font-semibold"
                  href="/"
                >
                  <span className="">Linguagem de Programação I</span>
                </Link>
              </div>
              <div className="flex-1 overflow-auto py-2">
                <nav className="grid items-start px-4 text-sm font-medium">
                  <NavItem href="/">
                    Início
                  </NavItem>
                  <NavItem href="/fracao">
                    Fração
                  </NavItem>
                  <NavItem href="/ex1">
                    Exercício 1
                  </NavItem>
                  <NavItem href="/ex2">
                    Exercício 2
                  </NavItem>
                  <NavItem href="/ex3">
                    Exercício 3
                  </NavItem>
                </nav>
              </div>
            </div>
          </div>
          <div className="flex flex-col">
            <header className="flex h-14 lg:h-[60px] items-center gap-4 border-b bg-gray-100/40 px-6 dark:bg-gray-800/40 justify-between lg:justify-end">
              <Link
                className="flex items-center gap-2 font-semibold lg:hidden"
                href="/"
              >
                <span className="">Linguagem de Programação I</span>
              </Link>
            </header>
            {children}
          </div>
        </div>
      </body>
    </html>
  );
}